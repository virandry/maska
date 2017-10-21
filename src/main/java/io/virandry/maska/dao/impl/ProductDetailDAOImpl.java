package io.virandry.maska.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import io.virandry.maska.dao.AbstractDAO;
import io.virandry.maska.dao.ProductDetailDAO;
import io.virandry.maska.model.Detail;
import io.virandry.maska.model.Subdetail;

@Component
public class ProductDetailDAOImpl extends AbstractDAO implements ProductDetailDAO{

	@SuppressWarnings("unchecked")
	@Override
	public List<Detail> getAllDetails() {
		String hql = "FROM Detail dtil ORDER BY dtil.detailId";
		return entityManager.createQuery(hql).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Subdetail> getAllSubDetails() {
		String hql = "FROM Subdetail sdtl ORDER BY sdtl.subDetailId";
		return entityManager.createQuery(hql).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Subdetail> getSubDetailsByProductId(int productId) {
		String hql = "FROM Subdetail sdtl WHERE sdtl.product.productId = :productId  ORDER BY sdtl.subDetailId";
		return entityManager.createQuery(hql).setParameter("productId", productId).getResultList();
	}

}

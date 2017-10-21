package io.virandry.maska.dao;

import java.util.List;

import io.virandry.maska.model.Detail;
import io.virandry.maska.model.Subdetail;

public interface ProductDetailDAO {
	List<Detail> getAllDetails();

	List<Subdetail> getAllSubDetails();

	List<Subdetail> getSubDetailsByProductId(int productId);
}

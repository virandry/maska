package io.virandry.maska.model;

public class ProductFilter {
	private String sortBy;
	private String subCategoryId;
	private String currencyId;
	private String isActive;

	public ProductFilter() {
		super();
	}

	public ProductFilter(String sortBy, String subCategoryId, String currencyId, String isActive) {
		super();
		this.sortBy = sortBy;
		this.subCategoryId = subCategoryId;
		this.currencyId = currencyId;
		this.isActive = isActive;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}

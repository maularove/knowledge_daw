package com.fpmislata.jpalibros.d_persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.jpalibros.c_domain.service.model.Category;
import com.fpmislata.jpalibros.d_persistence.zdao.impl.model.CategoryDaoModel;

@Mapper
public interface CategoryDaoMapper {

    CategoryDaoMapper INSTANCE = Mappers.getMapper(CategoryDaoMapper.class);

    CategoryDaoModel toCategoryDaoModel(Category category);

    Category toCategory(CategoryDaoModel categoryDaoModel);
}

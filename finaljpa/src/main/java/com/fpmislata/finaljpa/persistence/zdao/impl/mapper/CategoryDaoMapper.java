package com.fpmislata.finaljpa.persistence.zdao.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.finaljpa.domain.service.model.Category;
import com.fpmislata.finaljpa.persistence.zdao.impl.model.CategoryDaoEntity;

@Mapper
public interface CategoryDaoMapper {

    CategoryDaoMapper INSTANCE = Mappers.getMapper(CategoryDaoMapper.class);

    Category toCategory(CategoryDaoEntity categoryDaoEntity);

    CategoryDaoEntity toCategoryDaoEntity(Category category);
}

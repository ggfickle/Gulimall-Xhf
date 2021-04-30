package io.niceseason.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.niceseason.common.utils.PageUtils;
import io.niceseason.common.utils.Query;

import io.niceseason.gulimall.product.dao.CategoryDao;
import io.niceseason.gulimall.product.entity.CategoryEntity;
import io.niceseason.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有的分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        // 组装成父子结构
        // 1、找到所有的一级分类
        List<CategoryEntity> level1Menus = categoryEntities.stream()
                .filter(f -> f.getParentCid() == 0)
                .map((menu) -> {
                    menu.setChildren(getChiledrens(menu, categoryEntities));
                    return menu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());
        return level1Menus;
    }

    // 递归查找所有的子菜单
    private List<CategoryEntity> getChiledrens(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChiledrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
    }
}

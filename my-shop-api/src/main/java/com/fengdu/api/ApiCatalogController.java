package com.fengdu.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fengdu.annotation.IgnoreAuth;
import com.fengdu.annotation.LoginUser;
import com.fengdu.entity.CategoryVo;
import com.fengdu.entity.UserVo;
import com.fengdu.service.ApiCategoryService;
import com.fengdu.util.ApiBaseAction;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者: @author Harmon <br>
 * 时间: 2017-08-11 08:32<br>
 * 描述: ApiIndexController <br>
 */
@RestController
@RequestMapping("/api/catalog")
@Api(value = "分类栏目模块接口->api", tags = { "分类栏目接口Controller" })
public class ApiCatalogController extends ApiBaseAction {
    @Autowired
    private ApiCategoryService categoryService;

    /**
     * 获取分类栏目数据
     */
    @IgnoreAuth
    @RequestMapping("index")
    @ApiOperation(value = "获取分类栏目数据接口",response=Map.class, notes = "获取分类栏目数据接口")
    public Object index(@LoginUser UserVo loginUser, Integer id,
                        @RequestParam(value = "page", defaultValue = "1") Integer page,
                        @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Map<String, Object> resultObj = new HashMap();
        Map params = new HashMap();
        params.put("page", page);
        params.put("limit", size);
        params.put("sidx", "sort_order");
        params.put("order", "asc");
        params.put("parent_id", 0);
        //查询列表数据
        List<CategoryVo> data = categoryService.queryList(params);
        //
        CategoryVo currentCategory = null;
        if (null != id) {
            currentCategory = categoryService.queryObject(id);
        }
        if (null == currentCategory && null!= data && data.size() != 0) {
            currentCategory = data.get(0);
        } else {
            currentCategory = new CategoryVo();
        }

        //获取子分类数据
        if (null != currentCategory && null != currentCategory.getId()) {
            params.put("parent_id", currentCategory.getId());
            currentCategory.setSubCategoryList(categoryService.queryList(params));
        }

        resultObj.put("categoryList", data);
        resultObj.put("currentCategory", currentCategory);
        return toResponsSuccess(resultObj);
    }

    /**
     */
    @IgnoreAuth
    @RequestMapping("current")
    public Object current(@LoginUser UserVo loginUser, Integer id) {
        Map<String, Object> resultObj = new HashMap();
        Map params = new HashMap();
        params.put("parent_id", 0);
        CategoryVo currentCategory = null;
        if (null != id) {
            currentCategory = categoryService.queryObject(id);
        }
        //获取子分类数据
        if (null != currentCategory && null != currentCategory.getId()) {
            params.put("parent_id", currentCategory.getId());
            currentCategory.setSubCategoryList(categoryService.queryList(params));
        }
        resultObj.put("currentCategory", currentCategory);
        return toResponsSuccess(resultObj);
    }
}
package com.joker;

import com.joker.entity.CgfhzhCgpssz;
import com.joker.service.CommonService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = MultipleMybatisApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MultipleMybatisApplicationTests {

    @Resource
    CommonService commonService;

    @Test
    void contextLoads() {
        List<CgfhzhCgpssz> allCgfhzhCgpssz = commonService.getAllCgfhzhCgpssz();
        List<CgfhzhCgpssz> allCgfhzhCgpssz1 = commonService.getAllCgfhzhCgpssz1();
        System.out.println(111);
//        commonService.addCgfhzhCgpssz(commonService.getAllCgfhzhCgpssz());
//        commonService.addCgfhzhJzpgdw(commonService.getAllCgfhzhJzpgdw());
//        commonService.addCgfhzhKjcgCgwcdwqk(commonService.getAllCgfhzhKjcgCgwcdwqk());
//        commonService.addCgfhzhKjcgJcqk(commonService.getAllCgfhzhKjcgJcqk());
//        commonService.addCgfhzhKjcg(commonService.getAllCgfhzhKjcg());
//        commonService.addCgfhzhKjcgPjqk(commonService.getAllCgfhzhKjcgPjqk());
//        commonService.addCgfhzhKjcgRjzzq(commonService.getAllCgfhzhKjcgRjzzq());
//        commonService.addCgfhzhKjcgZl(commonService.getAllCgfhzhKjcgZl());
//        commonService.addCgfhzhKjcgZlk(commonService.getAllCgfhzhKjcgZlk());
//        commonService.addCgfhzhKjcgZtrz(commonService.getAllCgfhzhKjcgZtrz());
//        commonService.addCgfhzhTpxw(commonService.getAllCgfhzhTpxw());
//
//        //表 cgfhzh_tzgg nr字段短
//        commonService.addCgfhzhTzgg(commonService.getAllCgfhzhTzgg());
//
//        //表 cgfhzh_zdgf nr字段短
//        commonService.addCgfhzhZdgf(commonService.getAllCgfhzhZdgf());
//
//        // cgfhzh_zhmu 表不存在
////        commonService.addCgfhzhZhmu(commonService.getAllCgfhzhZhmu());
//
//        commonService.addCgfhzhZhssdw(commonService.getAllCgfhzhZhssdw());
//        commonService.addCgfhzhZjpsxx(commonService.getAllCgfhzhZjpsxx());
//        commonService.addCommKeyValues(commonService.getAllCommKeyValues());
//        commonService.addCommOrganization(commonService.getAllCommOrganization());
//        commonService.addCommSysModule(commonService.getAllCommSysModule());
//        commonService.addCommSysRole(commonService.getAllCommSysRole());
//        commonService.addCommSysRoleModulePurview(commonService.getAllCommSysRoleModulePurview());
//        commonService.addCommSysRoleUser(commonService.getAllCommSysRoleUser());
//        commonService.addCommSysUser(commonService.getAllCommSysUser());
//        commonService.addCommSysUserZj(commonService.getAllCommSysUserZj());
    }
}

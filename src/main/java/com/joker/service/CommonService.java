package com.joker.service;

import com.joker.annotation.DataSource;
import com.joker.config.Source;
import com.joker.entity.*;
import com.joker.mapper.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
public class CommonService {

    @Resource CgfhzhCgpsszMapper cgfhzhCgpsszMapper;
    @Resource CgfhzhJzpgdwMapper cgfhzhJzpgdwMapper;
    @Resource CgfhzhKjcgCgwcdwqkMapper cgfhzhKjcgCgwcdwqkMapper;
    @Resource CgfhzhKjcgJcqkMapper cgfhzhKjcgJcqkMapper;
    @Resource CgfhzhKjcgMapper cgfhzhKjcgMapper;
    @Resource CgfhzhKjcgPjqkMapper cgfhzhKjcgPjqkMapper;
    @Resource CgfhzhKjcgRjzzqMapper cgfhzhKjcgRjzzqMapper;
    @Resource CgfhzhKjcgZlkMapper cgfhzhKjcgZlkMapper;
    @Resource CgfhzhKjcgZlMapper cgfhzhKjcgZlMapper;
    @Resource CgfhzhKjcgZtrzMapper cgfhzhKjcgZtrzMapper;
    @Resource CgfhzhTpxwMapper cgfhzhTpxwMapper;
    @Resource CgfhzhTzggMapper cgfhzhTzggMapper;
    @Resource CgfhzhZdgfMapper cgfhzhZdgfMapper;
    @Resource CgfhzhZhmuMapper cgfhzhZhmuMapper;
    @Resource CgfhzhZhssdwMapper cgfhzhZhssdwMapper;
    @Resource CgfhzhZjpsxxMapper cgfhzhZjpsxxMapper;
    @Resource CommKeyValuesMapper commKeyValuesMapper;
    @Resource CommOrganizationMapper commOrganizationMapper;
    @Resource CommSysModuleMapper commSysModuleMapper;
    @Resource CommSysRoleMapper commSysRoleMapper;
    @Resource CommSysRoleModulePurviewMapper commSysRoleModulePurviewMapper;
    @Resource CommSysRoleUserMapper commSysRoleUserMapper;
    @Resource CommSysUserMapper commSysUserMapper;
    @Resource CommSysUserZjMapper commSysUserZjMapper;

    @DataSource(Source.ORACLE)
    public List<CgfhzhCgpssz> getAllCgfhzhCgpssz() { return cgfhzhCgpsszMapper.findList(); }
    @DataSource(Source.MYSQL)
    public List<CgfhzhCgpssz> getAllCgfhzhCgpssz1() { return cgfhzhCgpsszMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhCgpssz(List<CgfhzhCgpssz> list){ if(noLength(list)) return; cgfhzhCgpsszMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhJzpgdw> getAllCgfhzhJzpgdw() { return cgfhzhJzpgdwMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhJzpgdw(List<CgfhzhJzpgdw> list){ if(noLength(list)) return; cgfhzhJzpgdwMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhKjcgCgwcdwqk> getAllCgfhzhKjcgCgwcdwqk() { return cgfhzhKjcgCgwcdwqkMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhKjcgCgwcdwqk(List<CgfhzhKjcgCgwcdwqk> list){ if(noLength(list)) return; cgfhzhKjcgCgwcdwqkMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhKjcgJcqk> getAllCgfhzhKjcgJcqk() { return cgfhzhKjcgJcqkMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhKjcgJcqk(List<CgfhzhKjcgJcqk> list){ if(noLength(list)) return; cgfhzhKjcgJcqkMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhKjcg> getAllCgfhzhKjcg() { return cgfhzhKjcgMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhKjcg(List<CgfhzhKjcg> list){ if(noLength(list)) return; cgfhzhKjcgMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhKjcgPjqk> getAllCgfhzhKjcgPjqk() { return cgfhzhKjcgPjqkMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhKjcgPjqk(List<CgfhzhKjcgPjqk> list){ if(noLength(list)) return; cgfhzhKjcgPjqkMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhKjcgRjzzq> getAllCgfhzhKjcgRjzzq() { return cgfhzhKjcgRjzzqMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhKjcgRjzzq(List<CgfhzhKjcgRjzzq> list){ if(noLength(list)) return; cgfhzhKjcgRjzzqMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhKjcgZlk> getAllCgfhzhKjcgZlk() { return cgfhzhKjcgZlkMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhKjcgZlk(List<CgfhzhKjcgZlk> list){ if(noLength(list)) return; cgfhzhKjcgZlkMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhKjcgZl> getAllCgfhzhKjcgZl() { return cgfhzhKjcgZlMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhKjcgZl(List<CgfhzhKjcgZl> list){ if(noLength(list)) return; cgfhzhKjcgZlMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhKjcgZtrz> getAllCgfhzhKjcgZtrz() { return cgfhzhKjcgZtrzMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhKjcgZtrz(List<CgfhzhKjcgZtrz> list){ if(noLength(list)) return; cgfhzhKjcgZtrzMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhTpxw> getAllCgfhzhTpxw() { return cgfhzhTpxwMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhTpxw(List<CgfhzhTpxw> list){ if(noLength(list)) return; cgfhzhTpxwMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhTzgg> getAllCgfhzhTzgg() { return cgfhzhTzggMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhTzgg(List<CgfhzhTzgg> list){ if(noLength(list)) return; cgfhzhTzggMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhZdgf> getAllCgfhzhZdgf() { return cgfhzhZdgfMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhZdgf(List<CgfhzhZdgf> list){ if(noLength(list)) return; cgfhzhZdgfMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhZhmu> getAllCgfhzhZhmu() { return cgfhzhZhmuMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhZhmu(List<CgfhzhZhmu> list){ if(noLength(list)) return; cgfhzhZhmuMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhZhssdw> getAllCgfhzhZhssdw() { return cgfhzhZhssdwMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhZhssdw(List<CgfhzhZhssdw> list){ if(noLength(list)) return; cgfhzhZhssdwMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CgfhzhZjpsxx> getAllCgfhzhZjpsxx() { return cgfhzhZjpsxxMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCgfhzhZjpsxx(List<CgfhzhZjpsxx> list){ if(noLength(list)) return; cgfhzhZjpsxxMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CommKeyValues> getAllCommKeyValues() { return commKeyValuesMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCommKeyValues(List<CommKeyValues> list){ if(noLength(list)) return; commKeyValuesMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CommOrganization> getAllCommOrganization() { return commOrganizationMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCommOrganization(List<CommOrganization> list){ if(noLength(list)) return; commOrganizationMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CommSysModule> getAllCommSysModule() { return commSysModuleMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCommSysModule(List<CommSysModule> list){ if(noLength(list)) return; commSysModuleMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CommSysRole> getAllCommSysRole() { return commSysRoleMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCommSysRole(List<CommSysRole> list){ if(noLength(list)) return; commSysRoleMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CommSysRoleModulePurview> getAllCommSysRoleModulePurview() { return commSysRoleModulePurviewMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCommSysRoleModulePurview(List<CommSysRoleModulePurview> list){ if(noLength(list)) return; commSysRoleModulePurviewMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CommSysRoleUser> getAllCommSysRoleUser() { return commSysRoleUserMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCommSysRoleUser(List<CommSysRoleUser> list){ if(noLength(list)) return; commSysRoleUserMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CommSysUser> getAllCommSysUser() { return commSysUserMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCommSysUser(List<CommSysUser> list){ if(noLength(list)) return; commSysUserMapper.insert(list); }

    @DataSource(Source.ORACLE)
    public List<CommSysUserZj> getAllCommSysUserZj() { return commSysUserZjMapper.findList(); }
    @DataSource(Source.MYSQL)
    public void addCommSysUserZj(List<CommSysUserZj> list){ if(noLength(list)) return; commSysUserZjMapper.insert(list); }

    /**
     * 判断 list 是否为空
     * @param collection list
     * @return 是否有元素
     */
    public static boolean noLength(Collection<?> collection){
        return collection == null || collection.isEmpty();
    }
}

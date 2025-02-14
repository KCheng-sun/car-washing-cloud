package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysDept;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysDeptBoToSysDeptMapperImpl implements SysDeptBoToSysDeptMapper {

    @Override
    public SysDept convert(SysDeptBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDept sysDept = new SysDept();

        sysDept.setCreateBy( arg0.getCreateBy() );
        sysDept.setCreateDept( arg0.getCreateDept() );
        sysDept.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysDept.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysDept.setSearchValue( arg0.getSearchValue() );
        sysDept.setUpdateBy( arg0.getUpdateBy() );
        sysDept.setUpdateTime( arg0.getUpdateTime() );
        sysDept.setDeptId( arg0.getDeptId() );
        sysDept.setDeptName( arg0.getDeptName() );
        sysDept.setEmail( arg0.getEmail() );
        sysDept.setLeader( arg0.getLeader() );
        sysDept.setOrderNum( arg0.getOrderNum() );
        sysDept.setParentId( arg0.getParentId() );
        sysDept.setPhone( arg0.getPhone() );
        sysDept.setStatus( arg0.getStatus() );

        return sysDept;
    }

    @Override
    public SysDept convert(SysDeptBo source, SysDept target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateDept( source.getCreateDept() );
        target.setCreateTime( source.getCreateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        target.setSearchValue( source.getSearchValue() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setDeptId( source.getDeptId() );
        target.setDeptName( source.getDeptName() );
        target.setEmail( source.getEmail() );
        target.setLeader( source.getLeader() );
        target.setOrderNum( source.getOrderNum() );
        target.setParentId( source.getParentId() );
        target.setPhone( source.getPhone() );
        target.setStatus( source.getStatus() );

        return target;
    }
}

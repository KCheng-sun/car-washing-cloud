package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysDept;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysDeptVoToSysDeptMapperImpl implements SysDeptVoToSysDeptMapper {

    @Override
    public SysDept convert(SysDeptVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDept sysDept = new SysDept();

        sysDept.setCreateTime( arg0.getCreateTime() );
        sysDept.setAncestors( arg0.getAncestors() );
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
    public SysDept convert(SysDeptVo source, SysDept target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setAncestors( source.getAncestors() );
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

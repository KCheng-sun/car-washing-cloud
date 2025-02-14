package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysDeptVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysDeptToSysDeptVoMapperImpl implements SysDeptToSysDeptVoMapper {

    @Override
    public SysDeptVo convert(SysDept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDeptVo sysDeptVo = new SysDeptVo();

        sysDeptVo.setAncestors( arg0.getAncestors() );
        sysDeptVo.setCreateTime( arg0.getCreateTime() );
        sysDeptVo.setDeptId( arg0.getDeptId() );
        sysDeptVo.setDeptName( arg0.getDeptName() );
        sysDeptVo.setEmail( arg0.getEmail() );
        sysDeptVo.setLeader( arg0.getLeader() );
        sysDeptVo.setOrderNum( arg0.getOrderNum() );
        sysDeptVo.setParentId( arg0.getParentId() );
        sysDeptVo.setPhone( arg0.getPhone() );
        sysDeptVo.setStatus( arg0.getStatus() );

        return sysDeptVo;
    }

    @Override
    public SysDeptVo convert(SysDept source, SysDeptVo target) {
        if ( source == null ) {
            return target;
        }

        target.setAncestors( source.getAncestors() );
        target.setCreateTime( source.getCreateTime() );
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

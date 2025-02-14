package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysPostVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysPostToSysPostVoMapperImpl implements SysPostToSysPostVoMapper {

    @Override
    public SysPostVo convert(SysPost arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPostVo sysPostVo = new SysPostVo();

        sysPostVo.setCreateTime( arg0.getCreateTime() );
        sysPostVo.setPostCode( arg0.getPostCode() );
        sysPostVo.setPostId( arg0.getPostId() );
        sysPostVo.setPostName( arg0.getPostName() );
        sysPostVo.setPostSort( arg0.getPostSort() );
        sysPostVo.setRemark( arg0.getRemark() );
        sysPostVo.setStatus( arg0.getStatus() );

        return sysPostVo;
    }

    @Override
    public SysPostVo convert(SysPost source, SysPostVo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setPostCode( source.getPostCode() );
        target.setPostId( source.getPostId() );
        target.setPostName( source.getPostName() );
        target.setPostSort( source.getPostSort() );
        target.setRemark( source.getRemark() );
        target.setStatus( source.getStatus() );

        return target;
    }
}

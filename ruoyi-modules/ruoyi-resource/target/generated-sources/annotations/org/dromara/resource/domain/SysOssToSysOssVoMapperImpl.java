package org.dromara.resource.domain;

import javax.annotation.processing.Generated;
import org.dromara.resource.domain.vo.SysOssVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:30:41+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOssToSysOssVoMapperImpl implements SysOssToSysOssVoMapper {

    @Override
    public SysOssVo convert(SysOss arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssVo sysOssVo = new SysOssVo();

        sysOssVo.setCreateBy( arg0.getCreateBy() );
        sysOssVo.setCreateTime( arg0.getCreateTime() );
        sysOssVo.setFileName( arg0.getFileName() );
        sysOssVo.setFileSuffix( arg0.getFileSuffix() );
        sysOssVo.setOriginalName( arg0.getOriginalName() );
        sysOssVo.setOssId( arg0.getOssId() );
        sysOssVo.setService( arg0.getService() );
        sysOssVo.setUrl( arg0.getUrl() );

        return sysOssVo;
    }

    @Override
    public SysOssVo convert(SysOss source, SysOssVo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setFileName( source.getFileName() );
        target.setFileSuffix( source.getFileSuffix() );
        target.setOriginalName( source.getOriginalName() );
        target.setOssId( source.getOssId() );
        target.setService( source.getService() );
        target.setUrl( source.getUrl() );

        return target;
    }
}

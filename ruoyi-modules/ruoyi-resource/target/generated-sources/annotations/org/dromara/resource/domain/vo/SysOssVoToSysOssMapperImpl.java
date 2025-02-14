package org.dromara.resource.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.resource.domain.SysOss;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:41+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOssVoToSysOssMapperImpl implements SysOssVoToSysOssMapper {

    @Override
    public SysOss convert(SysOssVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOss sysOss = new SysOss();

        sysOss.setCreateBy( arg0.getCreateBy() );
        sysOss.setCreateTime( arg0.getCreateTime() );
        sysOss.setFileName( arg0.getFileName() );
        sysOss.setFileSuffix( arg0.getFileSuffix() );
        sysOss.setOriginalName( arg0.getOriginalName() );
        sysOss.setOssId( arg0.getOssId() );
        sysOss.setService( arg0.getService() );
        sysOss.setUrl( arg0.getUrl() );

        return sysOss;
    }

    @Override
    public SysOss convert(SysOssVo source, SysOss target) {
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

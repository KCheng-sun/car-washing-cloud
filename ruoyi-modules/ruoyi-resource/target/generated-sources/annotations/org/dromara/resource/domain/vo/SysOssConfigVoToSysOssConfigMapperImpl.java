package org.dromara.resource.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.resource.domain.SysOssConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:41+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOssConfigVoToSysOssConfigMapperImpl implements SysOssConfigVoToSysOssConfigMapper {

    @Override
    public SysOssConfig convert(SysOssConfigVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssConfig sysOssConfig = new SysOssConfig();

        sysOssConfig.setAccessKey( arg0.getAccessKey() );
        sysOssConfig.setAccessPolicy( arg0.getAccessPolicy() );
        sysOssConfig.setBucketName( arg0.getBucketName() );
        sysOssConfig.setConfigKey( arg0.getConfigKey() );
        sysOssConfig.setDomain( arg0.getDomain() );
        sysOssConfig.setEndpoint( arg0.getEndpoint() );
        sysOssConfig.setExt1( arg0.getExt1() );
        sysOssConfig.setIsHttps( arg0.getIsHttps() );
        sysOssConfig.setOssConfigId( arg0.getOssConfigId() );
        sysOssConfig.setPrefix( arg0.getPrefix() );
        sysOssConfig.setRegion( arg0.getRegion() );
        sysOssConfig.setRemark( arg0.getRemark() );
        sysOssConfig.setSecretKey( arg0.getSecretKey() );
        sysOssConfig.setStatus( arg0.getStatus() );

        return sysOssConfig;
    }

    @Override
    public SysOssConfig convert(SysOssConfigVo source, SysOssConfig target) {
        if ( source == null ) {
            return target;
        }

        target.setAccessKey( source.getAccessKey() );
        target.setAccessPolicy( source.getAccessPolicy() );
        target.setBucketName( source.getBucketName() );
        target.setConfigKey( source.getConfigKey() );
        target.setDomain( source.getDomain() );
        target.setEndpoint( source.getEndpoint() );
        target.setExt1( source.getExt1() );
        target.setIsHttps( source.getIsHttps() );
        target.setOssConfigId( source.getOssConfigId() );
        target.setPrefix( source.getPrefix() );
        target.setRegion( source.getRegion() );
        target.setRemark( source.getRemark() );
        target.setSecretKey( source.getSecretKey() );
        target.setStatus( source.getStatus() );

        return target;
    }
}

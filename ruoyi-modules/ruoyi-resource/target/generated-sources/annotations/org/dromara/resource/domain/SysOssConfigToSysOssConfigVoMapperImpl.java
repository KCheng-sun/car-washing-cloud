package org.dromara.resource.domain;

import javax.annotation.processing.Generated;
import org.dromara.resource.domain.vo.SysOssConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:41+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOssConfigToSysOssConfigVoMapperImpl implements SysOssConfigToSysOssConfigVoMapper {

    @Override
    public SysOssConfigVo convert(SysOssConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssConfigVo sysOssConfigVo = new SysOssConfigVo();

        sysOssConfigVo.setAccessKey( arg0.getAccessKey() );
        sysOssConfigVo.setAccessPolicy( arg0.getAccessPolicy() );
        sysOssConfigVo.setBucketName( arg0.getBucketName() );
        sysOssConfigVo.setConfigKey( arg0.getConfigKey() );
        sysOssConfigVo.setDomain( arg0.getDomain() );
        sysOssConfigVo.setEndpoint( arg0.getEndpoint() );
        sysOssConfigVo.setExt1( arg0.getExt1() );
        sysOssConfigVo.setIsHttps( arg0.getIsHttps() );
        sysOssConfigVo.setOssConfigId( arg0.getOssConfigId() );
        sysOssConfigVo.setPrefix( arg0.getPrefix() );
        sysOssConfigVo.setRegion( arg0.getRegion() );
        sysOssConfigVo.setRemark( arg0.getRemark() );
        sysOssConfigVo.setSecretKey( arg0.getSecretKey() );
        sysOssConfigVo.setStatus( arg0.getStatus() );

        return sysOssConfigVo;
    }

    @Override
    public SysOssConfigVo convert(SysOssConfig source, SysOssConfigVo target) {
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

package org.dromara.resource.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.resource.domain.SysOssConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:30:41+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOssConfigBoToSysOssConfigMapperImpl implements SysOssConfigBoToSysOssConfigMapper {

    @Override
    public SysOssConfig convert(SysOssConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssConfig sysOssConfig = new SysOssConfig();

        sysOssConfig.setCreateBy( arg0.getCreateBy() );
        sysOssConfig.setCreateDept( arg0.getCreateDept() );
        sysOssConfig.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysOssConfig.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysOssConfig.setSearchValue( arg0.getSearchValue() );
        sysOssConfig.setUpdateBy( arg0.getUpdateBy() );
        sysOssConfig.setUpdateTime( arg0.getUpdateTime() );
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
    public SysOssConfig convert(SysOssConfigBo source, SysOssConfig target) {
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

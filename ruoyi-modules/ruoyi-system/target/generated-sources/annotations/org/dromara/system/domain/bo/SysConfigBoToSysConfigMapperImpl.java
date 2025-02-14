package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysConfigBoToSysConfigMapperImpl implements SysConfigBoToSysConfigMapper {

    @Override
    public SysConfig convert(SysConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysConfig sysConfig = new SysConfig();

        sysConfig.setCreateBy( arg0.getCreateBy() );
        sysConfig.setCreateDept( arg0.getCreateDept() );
        sysConfig.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysConfig.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysConfig.setSearchValue( arg0.getSearchValue() );
        sysConfig.setUpdateBy( arg0.getUpdateBy() );
        sysConfig.setUpdateTime( arg0.getUpdateTime() );
        sysConfig.setConfigId( arg0.getConfigId() );
        sysConfig.setConfigKey( arg0.getConfigKey() );
        sysConfig.setConfigName( arg0.getConfigName() );
        sysConfig.setConfigType( arg0.getConfigType() );
        sysConfig.setConfigValue( arg0.getConfigValue() );
        sysConfig.setRemark( arg0.getRemark() );

        return sysConfig;
    }

    @Override
    public SysConfig convert(SysConfigBo source, SysConfig target) {
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
        target.setConfigId( source.getConfigId() );
        target.setConfigKey( source.getConfigKey() );
        target.setConfigName( source.getConfigName() );
        target.setConfigType( source.getConfigType() );
        target.setConfigValue( source.getConfigValue() );
        target.setRemark( source.getRemark() );

        return target;
    }
}

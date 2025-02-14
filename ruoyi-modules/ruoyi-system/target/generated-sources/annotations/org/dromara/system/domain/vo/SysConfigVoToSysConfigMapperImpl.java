package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysConfigVoToSysConfigMapperImpl implements SysConfigVoToSysConfigMapper {

    @Override
    public SysConfig convert(SysConfigVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysConfig sysConfig = new SysConfig();

        sysConfig.setCreateTime( arg0.getCreateTime() );
        sysConfig.setConfigId( arg0.getConfigId() );
        sysConfig.setConfigKey( arg0.getConfigKey() );
        sysConfig.setConfigName( arg0.getConfigName() );
        sysConfig.setConfigType( arg0.getConfigType() );
        sysConfig.setConfigValue( arg0.getConfigValue() );
        sysConfig.setRemark( arg0.getRemark() );

        return sysConfig;
    }

    @Override
    public SysConfig convert(SysConfigVo source, SysConfig target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setConfigId( source.getConfigId() );
        target.setConfigKey( source.getConfigKey() );
        target.setConfigName( source.getConfigName() );
        target.setConfigType( source.getConfigType() );
        target.setConfigValue( source.getConfigValue() );
        target.setRemark( source.getRemark() );

        return target;
    }
}

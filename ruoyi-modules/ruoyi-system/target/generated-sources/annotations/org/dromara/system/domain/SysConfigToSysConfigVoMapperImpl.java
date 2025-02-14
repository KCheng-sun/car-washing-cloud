package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysConfigToSysConfigVoMapperImpl implements SysConfigToSysConfigVoMapper {

    @Override
    public SysConfigVo convert(SysConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysConfigVo sysConfigVo = new SysConfigVo();

        sysConfigVo.setConfigId( arg0.getConfigId() );
        sysConfigVo.setConfigKey( arg0.getConfigKey() );
        sysConfigVo.setConfigName( arg0.getConfigName() );
        sysConfigVo.setConfigType( arg0.getConfigType() );
        sysConfigVo.setConfigValue( arg0.getConfigValue() );
        sysConfigVo.setCreateTime( arg0.getCreateTime() );
        sysConfigVo.setRemark( arg0.getRemark() );

        return sysConfigVo;
    }

    @Override
    public SysConfigVo convert(SysConfig source, SysConfigVo target) {
        if ( source == null ) {
            return target;
        }

        target.setConfigId( source.getConfigId() );
        target.setConfigKey( source.getConfigKey() );
        target.setConfigName( source.getConfigName() );
        target.setConfigType( source.getConfigType() );
        target.setConfigValue( source.getConfigValue() );
        target.setCreateTime( source.getCreateTime() );
        target.setRemark( source.getRemark() );

        return target;
    }
}

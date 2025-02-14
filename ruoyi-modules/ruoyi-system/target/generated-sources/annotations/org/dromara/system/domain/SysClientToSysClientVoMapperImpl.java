package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysClientVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysClientToSysClientVoMapperImpl implements SysClientToSysClientVoMapper {

    @Override
    public SysClientVo convert(SysClient arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysClientVo sysClientVo = new SysClientVo();

        sysClientVo.setActiveTimeout( arg0.getActiveTimeout() );
        sysClientVo.setClientId( arg0.getClientId() );
        sysClientVo.setClientKey( arg0.getClientKey() );
        sysClientVo.setClientSecret( arg0.getClientSecret() );
        sysClientVo.setDeviceType( arg0.getDeviceType() );
        sysClientVo.setGrantType( arg0.getGrantType() );
        sysClientVo.setId( arg0.getId() );
        sysClientVo.setStatus( arg0.getStatus() );
        sysClientVo.setTimeout( arg0.getTimeout() );

        return sysClientVo;
    }

    @Override
    public SysClientVo convert(SysClient source, SysClientVo target) {
        if ( source == null ) {
            return target;
        }

        target.setActiveTimeout( source.getActiveTimeout() );
        target.setClientId( source.getClientId() );
        target.setClientKey( source.getClientKey() );
        target.setClientSecret( source.getClientSecret() );
        target.setDeviceType( source.getDeviceType() );
        target.setGrantType( source.getGrantType() );
        target.setId( source.getId() );
        target.setStatus( source.getStatus() );
        target.setTimeout( source.getTimeout() );

        return target;
    }
}

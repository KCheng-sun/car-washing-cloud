package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysClient;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysClientVoToSysClientMapperImpl implements SysClientVoToSysClientMapper {

    @Override
    public SysClient convert(SysClientVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysClient sysClient = new SysClient();

        sysClient.setActiveTimeout( arg0.getActiveTimeout() );
        sysClient.setClientId( arg0.getClientId() );
        sysClient.setClientKey( arg0.getClientKey() );
        sysClient.setClientSecret( arg0.getClientSecret() );
        sysClient.setDeviceType( arg0.getDeviceType() );
        sysClient.setGrantType( arg0.getGrantType() );
        sysClient.setId( arg0.getId() );
        sysClient.setStatus( arg0.getStatus() );
        sysClient.setTimeout( arg0.getTimeout() );

        return sysClient;
    }

    @Override
    public SysClient convert(SysClientVo source, SysClient target) {
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

package org.dromara.system.domain.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.dromara.system.api.domain.vo.RemoteClientVo;
import org.dromara.system.domain.vo.SysClientVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysClientVoConvertImpl implements SysClientVoConvert {

    @Override
    public RemoteClientVo convert(SysClientVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RemoteClientVo remoteClientVo = new RemoteClientVo();

        remoteClientVo.setActiveTimeout( arg0.getActiveTimeout() );
        remoteClientVo.setClientId( arg0.getClientId() );
        remoteClientVo.setClientKey( arg0.getClientKey() );
        remoteClientVo.setClientSecret( arg0.getClientSecret() );
        remoteClientVo.setDeviceType( arg0.getDeviceType() );
        remoteClientVo.setGrantType( arg0.getGrantType() );
        List<String> list = arg0.getGrantTypeList();
        if ( list != null ) {
            remoteClientVo.setGrantTypeList( new ArrayList<String>( list ) );
        }
        remoteClientVo.setId( arg0.getId() );
        remoteClientVo.setStatus( arg0.getStatus() );
        remoteClientVo.setTimeout( arg0.getTimeout() );

        return remoteClientVo;
    }

    @Override
    public RemoteClientVo convert(SysClientVo arg0, RemoteClientVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setActiveTimeout( arg0.getActiveTimeout() );
        arg1.setClientId( arg0.getClientId() );
        arg1.setClientKey( arg0.getClientKey() );
        arg1.setClientSecret( arg0.getClientSecret() );
        arg1.setDeviceType( arg0.getDeviceType() );
        arg1.setGrantType( arg0.getGrantType() );
        if ( arg1.getGrantTypeList() != null ) {
            List<String> list = arg0.getGrantTypeList();
            if ( list != null ) {
                arg1.getGrantTypeList().clear();
                arg1.getGrantTypeList().addAll( list );
            }
            else {
                arg1.setGrantTypeList( null );
            }
        }
        else {
            List<String> list = arg0.getGrantTypeList();
            if ( list != null ) {
                arg1.setGrantTypeList( new ArrayList<String>( list ) );
            }
        }
        arg1.setId( arg0.getId() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setTimeout( arg0.getTimeout() );

        return arg1;
    }
}

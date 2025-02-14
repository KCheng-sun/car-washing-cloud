package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysClient;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysClientBoToSysClientMapperImpl implements SysClientBoToSysClientMapper {

    @Override
    public SysClient convert(SysClientBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysClient sysClient = new SysClient();

        sysClient.setCreateBy( arg0.getCreateBy() );
        sysClient.setCreateDept( arg0.getCreateDept() );
        sysClient.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysClient.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysClient.setSearchValue( arg0.getSearchValue() );
        sysClient.setUpdateBy( arg0.getUpdateBy() );
        sysClient.setUpdateTime( arg0.getUpdateTime() );
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
    public SysClient convert(SysClientBo source, SysClient target) {
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

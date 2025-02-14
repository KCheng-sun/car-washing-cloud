package org.dromara.system.domain.convert;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.api.domain.bo.RemoteLogininforBo;
import org.dromara.system.domain.bo.SysLogininforBo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysLogininforBoConvertImpl implements SysLogininforBoConvert {

    @Override
    public SysLogininforBo convert(RemoteLogininforBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogininforBo sysLogininforBo = new SysLogininforBo();

        sysLogininforBo.setBrowser( arg0.getBrowser() );
        sysLogininforBo.setClientKey( arg0.getClientKey() );
        sysLogininforBo.setDeviceType( arg0.getDeviceType() );
        sysLogininforBo.setInfoId( arg0.getInfoId() );
        sysLogininforBo.setIpaddr( arg0.getIpaddr() );
        sysLogininforBo.setLoginLocation( arg0.getLoginLocation() );
        sysLogininforBo.setLoginTime( arg0.getLoginTime() );
        sysLogininforBo.setMsg( arg0.getMsg() );
        sysLogininforBo.setOs( arg0.getOs() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysLogininforBo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysLogininforBo.setStatus( arg0.getStatus() );
        sysLogininforBo.setTenantId( arg0.getTenantId() );
        sysLogininforBo.setUserName( arg0.getUserName() );

        return sysLogininforBo;
    }

    @Override
    public SysLogininforBo convert(RemoteLogininforBo arg0, SysLogininforBo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setBrowser( arg0.getBrowser() );
        arg1.setClientKey( arg0.getClientKey() );
        arg1.setDeviceType( arg0.getDeviceType() );
        arg1.setInfoId( arg0.getInfoId() );
        arg1.setIpaddr( arg0.getIpaddr() );
        arg1.setLoginLocation( arg0.getLoginLocation() );
        arg1.setLoginTime( arg0.getLoginTime() );
        arg1.setMsg( arg0.getMsg() );
        arg1.setOs( arg0.getOs() );
        if ( arg1.getParams() != null ) {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.getParams().clear();
                arg1.getParams().putAll( map );
            }
            else {
                arg1.setParams( null );
            }
        }
        else {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        arg1.setStatus( arg0.getStatus() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setUserName( arg0.getUserName() );

        return arg1;
    }
}

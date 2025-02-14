package org.dromara.system.domain.bo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysLogininfor;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysLogininforBoToSysLogininforMapperImpl implements SysLogininforBoToSysLogininforMapper {

    @Override
    public SysLogininfor convert(SysLogininforBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogininfor sysLogininfor = new SysLogininfor();

        sysLogininfor.setBrowser( arg0.getBrowser() );
        sysLogininfor.setClientKey( arg0.getClientKey() );
        sysLogininfor.setDeviceType( arg0.getDeviceType() );
        sysLogininfor.setInfoId( arg0.getInfoId() );
        sysLogininfor.setIpaddr( arg0.getIpaddr() );
        sysLogininfor.setLoginLocation( arg0.getLoginLocation() );
        sysLogininfor.setLoginTime( arg0.getLoginTime() );
        sysLogininfor.setMsg( arg0.getMsg() );
        sysLogininfor.setOs( arg0.getOs() );
        sysLogininfor.setStatus( arg0.getStatus() );
        sysLogininfor.setTenantId( arg0.getTenantId() );
        sysLogininfor.setUserName( arg0.getUserName() );

        return sysLogininfor;
    }

    @Override
    public SysLogininfor convert(SysLogininforBo source, SysLogininfor target) {
        if ( source == null ) {
            return target;
        }

        target.setBrowser( source.getBrowser() );
        target.setClientKey( source.getClientKey() );
        target.setDeviceType( source.getDeviceType() );
        target.setInfoId( source.getInfoId() );
        target.setIpaddr( source.getIpaddr() );
        target.setLoginLocation( source.getLoginLocation() );
        target.setLoginTime( source.getLoginTime() );
        target.setMsg( source.getMsg() );
        target.setOs( source.getOs() );
        target.setStatus( source.getStatus() );
        target.setTenantId( source.getTenantId() );
        target.setUserName( source.getUserName() );

        return target;
    }
}

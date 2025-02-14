package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysLogininforVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysLogininforToSysLogininforVoMapperImpl implements SysLogininforToSysLogininforVoMapper {

    @Override
    public SysLogininforVo convert(SysLogininfor arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogininforVo sysLogininforVo = new SysLogininforVo();

        sysLogininforVo.setBrowser( arg0.getBrowser() );
        sysLogininforVo.setClientKey( arg0.getClientKey() );
        sysLogininforVo.setDeviceType( arg0.getDeviceType() );
        sysLogininforVo.setInfoId( arg0.getInfoId() );
        sysLogininforVo.setIpaddr( arg0.getIpaddr() );
        sysLogininforVo.setLoginLocation( arg0.getLoginLocation() );
        sysLogininforVo.setLoginTime( arg0.getLoginTime() );
        sysLogininforVo.setMsg( arg0.getMsg() );
        sysLogininforVo.setOs( arg0.getOs() );
        sysLogininforVo.setStatus( arg0.getStatus() );
        sysLogininforVo.setTenantId( arg0.getTenantId() );
        sysLogininforVo.setUserName( arg0.getUserName() );

        return sysLogininforVo;
    }

    @Override
    public SysLogininforVo convert(SysLogininfor source, SysLogininforVo target) {
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

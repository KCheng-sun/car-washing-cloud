package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysOperLogVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOperLogToSysOperLogVoMapperImpl implements SysOperLogToSysOperLogVoMapper {

    @Override
    public SysOperLogVo convert(SysOperLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOperLogVo sysOperLogVo = new SysOperLogVo();

        sysOperLogVo.setBusinessType( arg0.getBusinessType() );
        sysOperLogVo.setCostTime( arg0.getCostTime() );
        sysOperLogVo.setDeptName( arg0.getDeptName() );
        sysOperLogVo.setErrorMsg( arg0.getErrorMsg() );
        sysOperLogVo.setJsonResult( arg0.getJsonResult() );
        sysOperLogVo.setMethod( arg0.getMethod() );
        sysOperLogVo.setOperId( arg0.getOperId() );
        sysOperLogVo.setOperIp( arg0.getOperIp() );
        sysOperLogVo.setOperLocation( arg0.getOperLocation() );
        sysOperLogVo.setOperName( arg0.getOperName() );
        sysOperLogVo.setOperParam( arg0.getOperParam() );
        sysOperLogVo.setOperTime( arg0.getOperTime() );
        sysOperLogVo.setOperUrl( arg0.getOperUrl() );
        sysOperLogVo.setOperatorType( arg0.getOperatorType() );
        sysOperLogVo.setRequestMethod( arg0.getRequestMethod() );
        sysOperLogVo.setStatus( arg0.getStatus() );
        sysOperLogVo.setTenantId( arg0.getTenantId() );
        sysOperLogVo.setTitle( arg0.getTitle() );

        return sysOperLogVo;
    }

    @Override
    public SysOperLogVo convert(SysOperLog source, SysOperLogVo target) {
        if ( source == null ) {
            return target;
        }

        target.setBusinessType( source.getBusinessType() );
        target.setCostTime( source.getCostTime() );
        target.setDeptName( source.getDeptName() );
        target.setErrorMsg( source.getErrorMsg() );
        target.setJsonResult( source.getJsonResult() );
        target.setMethod( source.getMethod() );
        target.setOperId( source.getOperId() );
        target.setOperIp( source.getOperIp() );
        target.setOperLocation( source.getOperLocation() );
        target.setOperName( source.getOperName() );
        target.setOperParam( source.getOperParam() );
        target.setOperTime( source.getOperTime() );
        target.setOperUrl( source.getOperUrl() );
        target.setOperatorType( source.getOperatorType() );
        target.setRequestMethod( source.getRequestMethod() );
        target.setStatus( source.getStatus() );
        target.setTenantId( source.getTenantId() );
        target.setTitle( source.getTitle() );

        return target;
    }
}

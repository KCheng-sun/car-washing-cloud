package org.dromara.system.domain.bo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysOperLog;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOperLogBoToSysOperLogMapperImpl implements SysOperLogBoToSysOperLogMapper {

    @Override
    public SysOperLog convert(SysOperLogBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOperLog sysOperLog = new SysOperLog();

        sysOperLog.setBusinessType( arg0.getBusinessType() );
        sysOperLog.setCostTime( arg0.getCostTime() );
        sysOperLog.setDeptName( arg0.getDeptName() );
        sysOperLog.setErrorMsg( arg0.getErrorMsg() );
        sysOperLog.setJsonResult( arg0.getJsonResult() );
        sysOperLog.setMethod( arg0.getMethod() );
        sysOperLog.setOperId( arg0.getOperId() );
        sysOperLog.setOperIp( arg0.getOperIp() );
        sysOperLog.setOperLocation( arg0.getOperLocation() );
        sysOperLog.setOperName( arg0.getOperName() );
        sysOperLog.setOperParam( arg0.getOperParam() );
        sysOperLog.setOperTime( arg0.getOperTime() );
        sysOperLog.setOperUrl( arg0.getOperUrl() );
        sysOperLog.setOperatorType( arg0.getOperatorType() );
        sysOperLog.setRequestMethod( arg0.getRequestMethod() );
        sysOperLog.setStatus( arg0.getStatus() );
        sysOperLog.setTenantId( arg0.getTenantId() );
        sysOperLog.setTitle( arg0.getTitle() );

        return sysOperLog;
    }

    @Override
    public SysOperLog convert(SysOperLogBo source, SysOperLog target) {
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

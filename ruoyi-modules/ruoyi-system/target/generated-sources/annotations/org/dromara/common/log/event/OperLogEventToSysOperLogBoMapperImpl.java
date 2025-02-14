package org.dromara.common.log.event;

import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.bo.SysOperLogBo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class OperLogEventToSysOperLogBoMapperImpl implements OperLogEventToSysOperLogBoMapper {

    @Override
    public SysOperLogBo convert(OperLogEvent arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOperLogBo sysOperLogBo = new SysOperLogBo();

        sysOperLogBo.setBusinessType( arg0.getBusinessType() );
        Integer[] businessTypes = arg0.getBusinessTypes();
        if ( businessTypes != null ) {
            sysOperLogBo.setBusinessTypes( Arrays.copyOf( businessTypes, businessTypes.length ) );
        }
        sysOperLogBo.setCostTime( arg0.getCostTime() );
        sysOperLogBo.setDeptName( arg0.getDeptName() );
        sysOperLogBo.setErrorMsg( arg0.getErrorMsg() );
        sysOperLogBo.setJsonResult( arg0.getJsonResult() );
        sysOperLogBo.setMethod( arg0.getMethod() );
        sysOperLogBo.setOperId( arg0.getOperId() );
        sysOperLogBo.setOperIp( arg0.getOperIp() );
        sysOperLogBo.setOperLocation( arg0.getOperLocation() );
        sysOperLogBo.setOperName( arg0.getOperName() );
        sysOperLogBo.setOperParam( arg0.getOperParam() );
        sysOperLogBo.setOperTime( arg0.getOperTime() );
        sysOperLogBo.setOperUrl( arg0.getOperUrl() );
        sysOperLogBo.setOperatorType( arg0.getOperatorType() );
        sysOperLogBo.setRequestMethod( arg0.getRequestMethod() );
        sysOperLogBo.setStatus( arg0.getStatus() );
        sysOperLogBo.setTenantId( arg0.getTenantId() );
        sysOperLogBo.setTitle( arg0.getTitle() );

        return sysOperLogBo;
    }

    @Override
    public SysOperLogBo convert(OperLogEvent source, SysOperLogBo target) {
        if ( source == null ) {
            return target;
        }

        target.setBusinessType( source.getBusinessType() );
        Integer[] businessTypes = source.getBusinessTypes();
        if ( businessTypes != null ) {
            target.setBusinessTypes( Arrays.copyOf( businessTypes, businessTypes.length ) );
        }
        else {
            target.setBusinessTypes( null );
        }
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

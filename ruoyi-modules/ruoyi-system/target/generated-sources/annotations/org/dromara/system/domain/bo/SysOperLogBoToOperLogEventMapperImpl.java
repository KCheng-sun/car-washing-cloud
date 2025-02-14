package org.dromara.system.domain.bo;

import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.dromara.common.log.event.OperLogEvent;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOperLogBoToOperLogEventMapperImpl implements SysOperLogBoToOperLogEventMapper {

    @Override
    public OperLogEvent convert(SysOperLogBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OperLogEvent operLogEvent = new OperLogEvent();

        operLogEvent.setBusinessType( arg0.getBusinessType() );
        Integer[] businessTypes = arg0.getBusinessTypes();
        if ( businessTypes != null ) {
            operLogEvent.setBusinessTypes( Arrays.copyOf( businessTypes, businessTypes.length ) );
        }
        operLogEvent.setCostTime( arg0.getCostTime() );
        operLogEvent.setDeptName( arg0.getDeptName() );
        operLogEvent.setErrorMsg( arg0.getErrorMsg() );
        operLogEvent.setJsonResult( arg0.getJsonResult() );
        operLogEvent.setMethod( arg0.getMethod() );
        operLogEvent.setOperId( arg0.getOperId() );
        operLogEvent.setOperIp( arg0.getOperIp() );
        operLogEvent.setOperLocation( arg0.getOperLocation() );
        operLogEvent.setOperName( arg0.getOperName() );
        operLogEvent.setOperParam( arg0.getOperParam() );
        operLogEvent.setOperTime( arg0.getOperTime() );
        operLogEvent.setOperUrl( arg0.getOperUrl() );
        operLogEvent.setOperatorType( arg0.getOperatorType() );
        operLogEvent.setRequestMethod( arg0.getRequestMethod() );
        operLogEvent.setStatus( arg0.getStatus() );
        operLogEvent.setTenantId( arg0.getTenantId() );
        operLogEvent.setTitle( arg0.getTitle() );

        return operLogEvent;
    }

    @Override
    public OperLogEvent convert(SysOperLogBo source, OperLogEvent target) {
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

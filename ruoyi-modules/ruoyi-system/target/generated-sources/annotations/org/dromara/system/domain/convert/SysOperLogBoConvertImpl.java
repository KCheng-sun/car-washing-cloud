package org.dromara.system.domain.convert;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.api.domain.bo.RemoteOperLogBo;
import org.dromara.system.domain.bo.SysOperLogBo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysOperLogBoConvertImpl implements SysOperLogBoConvert {

    @Override
    public SysOperLogBo convert(RemoteOperLogBo arg0, SysOperLogBo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setBusinessType( arg0.getBusinessType() );
        arg1.setCostTime( arg0.getCostTime() );
        arg1.setDeptName( arg0.getDeptName() );
        arg1.setErrorMsg( arg0.getErrorMsg() );
        arg1.setJsonResult( arg0.getJsonResult() );
        arg1.setMethod( arg0.getMethod() );
        arg1.setOperId( arg0.getOperId() );
        arg1.setOperIp( arg0.getOperIp() );
        arg1.setOperLocation( arg0.getOperLocation() );
        arg1.setOperName( arg0.getOperName() );
        arg1.setOperParam( arg0.getOperParam() );
        arg1.setOperTime( arg0.getOperTime() );
        arg1.setOperUrl( arg0.getOperUrl() );
        arg1.setOperatorType( arg0.getOperatorType() );
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
        arg1.setRequestMethod( arg0.getRequestMethod() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setTitle( arg0.getTitle() );

        return arg1;
    }

    @Override
    public SysOperLogBo convert(RemoteOperLogBo remoteOperLogBo) {
        if ( remoteOperLogBo == null ) {
            return null;
        }

        SysOperLogBo sysOperLogBo = new SysOperLogBo();

        sysOperLogBo.setBusinessType( remoteOperLogBo.getBusinessType() );
        sysOperLogBo.setCostTime( remoteOperLogBo.getCostTime() );
        sysOperLogBo.setDeptName( remoteOperLogBo.getDeptName() );
        sysOperLogBo.setErrorMsg( remoteOperLogBo.getErrorMsg() );
        sysOperLogBo.setJsonResult( remoteOperLogBo.getJsonResult() );
        sysOperLogBo.setMethod( remoteOperLogBo.getMethod() );
        sysOperLogBo.setOperId( remoteOperLogBo.getOperId() );
        sysOperLogBo.setOperIp( remoteOperLogBo.getOperIp() );
        sysOperLogBo.setOperLocation( remoteOperLogBo.getOperLocation() );
        sysOperLogBo.setOperName( remoteOperLogBo.getOperName() );
        sysOperLogBo.setOperParam( remoteOperLogBo.getOperParam() );
        sysOperLogBo.setOperTime( remoteOperLogBo.getOperTime() );
        sysOperLogBo.setOperUrl( remoteOperLogBo.getOperUrl() );
        sysOperLogBo.setOperatorType( remoteOperLogBo.getOperatorType() );
        Map<String, Object> map = remoteOperLogBo.getParams();
        if ( map != null ) {
            sysOperLogBo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysOperLogBo.setRequestMethod( remoteOperLogBo.getRequestMethod() );
        sysOperLogBo.setStatus( remoteOperLogBo.getStatus() );
        sysOperLogBo.setTenantId( remoteOperLogBo.getTenantId() );
        sysOperLogBo.setTitle( remoteOperLogBo.getTitle() );

        return sysOperLogBo;
    }
}

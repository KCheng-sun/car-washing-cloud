package org.dromara.auth.domain.convert;

import javax.annotation.processing.Generated;
import org.dromara.auth.domain.vo.TenantListVo;
import org.dromara.system.api.domain.vo.RemoteTenantVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:29+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class TenantVoConvertImpl implements TenantVoConvert {

    @Override
    public TenantListVo convert(RemoteTenantVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TenantListVo tenantListVo = new TenantListVo();

        tenantListVo.setCompanyName( arg0.getCompanyName() );
        tenantListVo.setDomain( arg0.getDomain() );
        tenantListVo.setTenantId( arg0.getTenantId() );

        return tenantListVo;
    }

    @Override
    public TenantListVo convert(RemoteTenantVo arg0, TenantListVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCompanyName( arg0.getCompanyName() );
        arg1.setDomain( arg0.getDomain() );
        arg1.setTenantId( arg0.getTenantId() );

        return arg1;
    }
}

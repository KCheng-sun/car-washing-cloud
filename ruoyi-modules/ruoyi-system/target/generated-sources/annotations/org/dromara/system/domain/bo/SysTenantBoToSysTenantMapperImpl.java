package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysTenant;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysTenantBoToSysTenantMapperImpl implements SysTenantBoToSysTenantMapper {

    @Override
    public SysTenant convert(SysTenantBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenant sysTenant = new SysTenant();

        sysTenant.setCreateBy( arg0.getCreateBy() );
        sysTenant.setCreateDept( arg0.getCreateDept() );
        sysTenant.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysTenant.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysTenant.setSearchValue( arg0.getSearchValue() );
        sysTenant.setUpdateBy( arg0.getUpdateBy() );
        sysTenant.setUpdateTime( arg0.getUpdateTime() );
        sysTenant.setAccountCount( arg0.getAccountCount() );
        sysTenant.setAddress( arg0.getAddress() );
        sysTenant.setCompanyName( arg0.getCompanyName() );
        sysTenant.setContactPhone( arg0.getContactPhone() );
        sysTenant.setContactUserName( arg0.getContactUserName() );
        sysTenant.setDomain( arg0.getDomain() );
        sysTenant.setExpireTime( arg0.getExpireTime() );
        sysTenant.setId( arg0.getId() );
        sysTenant.setIntro( arg0.getIntro() );
        sysTenant.setLicenseNumber( arg0.getLicenseNumber() );
        sysTenant.setPackageId( arg0.getPackageId() );
        sysTenant.setRemark( arg0.getRemark() );
        sysTenant.setStatus( arg0.getStatus() );
        sysTenant.setTenantId( arg0.getTenantId() );

        return sysTenant;
    }

    @Override
    public SysTenant convert(SysTenantBo source, SysTenant target) {
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
        target.setAccountCount( source.getAccountCount() );
        target.setAddress( source.getAddress() );
        target.setCompanyName( source.getCompanyName() );
        target.setContactPhone( source.getContactPhone() );
        target.setContactUserName( source.getContactUserName() );
        target.setDomain( source.getDomain() );
        target.setExpireTime( source.getExpireTime() );
        target.setId( source.getId() );
        target.setIntro( source.getIntro() );
        target.setLicenseNumber( source.getLicenseNumber() );
        target.setPackageId( source.getPackageId() );
        target.setRemark( source.getRemark() );
        target.setStatus( source.getStatus() );
        target.setTenantId( source.getTenantId() );

        return target;
    }
}

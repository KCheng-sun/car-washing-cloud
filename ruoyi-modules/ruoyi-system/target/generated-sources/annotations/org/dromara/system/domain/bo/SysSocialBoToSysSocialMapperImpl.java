package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysSocial;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysSocialBoToSysSocialMapperImpl implements SysSocialBoToSysSocialMapper {

    @Override
    public SysSocial convert(SysSocialBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSocial sysSocial = new SysSocial();

        sysSocial.setCreateBy( arg0.getCreateBy() );
        sysSocial.setCreateDept( arg0.getCreateDept() );
        sysSocial.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysSocial.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysSocial.setSearchValue( arg0.getSearchValue() );
        sysSocial.setUpdateBy( arg0.getUpdateBy() );
        sysSocial.setUpdateTime( arg0.getUpdateTime() );
        sysSocial.setTenantId( arg0.getTenantId() );
        sysSocial.setAccessCode( arg0.getAccessCode() );
        sysSocial.setAccessToken( arg0.getAccessToken() );
        sysSocial.setAuthId( arg0.getAuthId() );
        sysSocial.setAvatar( arg0.getAvatar() );
        sysSocial.setCode( arg0.getCode() );
        sysSocial.setEmail( arg0.getEmail() );
        sysSocial.setExpireIn( arg0.getExpireIn() );
        sysSocial.setId( arg0.getId() );
        sysSocial.setIdToken( arg0.getIdToken() );
        sysSocial.setMacAlgorithm( arg0.getMacAlgorithm() );
        sysSocial.setMacKey( arg0.getMacKey() );
        sysSocial.setNickName( arg0.getNickName() );
        sysSocial.setOauthToken( arg0.getOauthToken() );
        sysSocial.setOauthTokenSecret( arg0.getOauthTokenSecret() );
        sysSocial.setOpenId( arg0.getOpenId() );
        sysSocial.setRefreshToken( arg0.getRefreshToken() );
        sysSocial.setScope( arg0.getScope() );
        sysSocial.setSource( arg0.getSource() );
        sysSocial.setTokenType( arg0.getTokenType() );
        sysSocial.setUnionId( arg0.getUnionId() );
        sysSocial.setUserId( arg0.getUserId() );
        sysSocial.setUserName( arg0.getUserName() );

        return sysSocial;
    }

    @Override
    public SysSocial convert(SysSocialBo source, SysSocial target) {
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
        target.setTenantId( source.getTenantId() );
        target.setAccessCode( source.getAccessCode() );
        target.setAccessToken( source.getAccessToken() );
        target.setAuthId( source.getAuthId() );
        target.setAvatar( source.getAvatar() );
        target.setCode( source.getCode() );
        target.setEmail( source.getEmail() );
        target.setExpireIn( source.getExpireIn() );
        target.setId( source.getId() );
        target.setIdToken( source.getIdToken() );
        target.setMacAlgorithm( source.getMacAlgorithm() );
        target.setMacKey( source.getMacKey() );
        target.setNickName( source.getNickName() );
        target.setOauthToken( source.getOauthToken() );
        target.setOauthTokenSecret( source.getOauthTokenSecret() );
        target.setOpenId( source.getOpenId() );
        target.setRefreshToken( source.getRefreshToken() );
        target.setScope( source.getScope() );
        target.setSource( source.getSource() );
        target.setTokenType( source.getTokenType() );
        target.setUnionId( source.getUnionId() );
        target.setUserId( source.getUserId() );
        target.setUserName( source.getUserName() );

        return target;
    }
}

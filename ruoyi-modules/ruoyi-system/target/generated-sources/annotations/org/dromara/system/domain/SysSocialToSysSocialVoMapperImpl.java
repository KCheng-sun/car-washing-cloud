package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysSocialVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysSocialToSysSocialVoMapperImpl implements SysSocialToSysSocialVoMapper {

    @Override
    public SysSocialVo convert(SysSocial arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSocialVo sysSocialVo = new SysSocialVo();

        sysSocialVo.setAccessCode( arg0.getAccessCode() );
        sysSocialVo.setAccessToken( arg0.getAccessToken() );
        sysSocialVo.setAuthId( arg0.getAuthId() );
        sysSocialVo.setAvatar( arg0.getAvatar() );
        sysSocialVo.setCode( arg0.getCode() );
        sysSocialVo.setCreateTime( arg0.getCreateTime() );
        sysSocialVo.setEmail( arg0.getEmail() );
        sysSocialVo.setExpireIn( arg0.getExpireIn() );
        sysSocialVo.setId( arg0.getId() );
        sysSocialVo.setIdToken( arg0.getIdToken() );
        sysSocialVo.setMacAlgorithm( arg0.getMacAlgorithm() );
        sysSocialVo.setMacKey( arg0.getMacKey() );
        sysSocialVo.setNickName( arg0.getNickName() );
        sysSocialVo.setOauthToken( arg0.getOauthToken() );
        sysSocialVo.setOauthTokenSecret( arg0.getOauthTokenSecret() );
        sysSocialVo.setOpenId( arg0.getOpenId() );
        sysSocialVo.setRefreshToken( arg0.getRefreshToken() );
        sysSocialVo.setScope( arg0.getScope() );
        sysSocialVo.setSource( arg0.getSource() );
        sysSocialVo.setTenantId( arg0.getTenantId() );
        sysSocialVo.setTokenType( arg0.getTokenType() );
        sysSocialVo.setUnionId( arg0.getUnionId() );
        sysSocialVo.setUserId( arg0.getUserId() );
        sysSocialVo.setUserName( arg0.getUserName() );

        return sysSocialVo;
    }

    @Override
    public SysSocialVo convert(SysSocial source, SysSocialVo target) {
        if ( source == null ) {
            return target;
        }

        target.setAccessCode( source.getAccessCode() );
        target.setAccessToken( source.getAccessToken() );
        target.setAuthId( source.getAuthId() );
        target.setAvatar( source.getAvatar() );
        target.setCode( source.getCode() );
        target.setCreateTime( source.getCreateTime() );
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
        target.setTenantId( source.getTenantId() );
        target.setTokenType( source.getTokenType() );
        target.setUnionId( source.getUnionId() );
        target.setUserId( source.getUserId() );
        target.setUserName( source.getUserName() );

        return target;
    }
}

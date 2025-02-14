package org.dromara.system.domain.convert;

import javax.annotation.processing.Generated;
import org.dromara.system.api.domain.bo.RemoteSocialBo;
import org.dromara.system.domain.bo.SysSocialBo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysSocialBoConvertImpl implements SysSocialBoConvert {

    @Override
    public SysSocialBo convert(RemoteSocialBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSocialBo sysSocialBo = new SysSocialBo();

        sysSocialBo.setAccessCode( arg0.getAccessCode() );
        sysSocialBo.setAccessToken( arg0.getAccessToken() );
        sysSocialBo.setAuthId( arg0.getAuthId() );
        sysSocialBo.setAvatar( arg0.getAvatar() );
        sysSocialBo.setCode( arg0.getCode() );
        sysSocialBo.setEmail( arg0.getEmail() );
        sysSocialBo.setExpireIn( arg0.getExpireIn() );
        sysSocialBo.setId( arg0.getId() );
        sysSocialBo.setIdToken( arg0.getIdToken() );
        sysSocialBo.setMacAlgorithm( arg0.getMacAlgorithm() );
        sysSocialBo.setMacKey( arg0.getMacKey() );
        sysSocialBo.setNickName( arg0.getNickName() );
        sysSocialBo.setOauthToken( arg0.getOauthToken() );
        sysSocialBo.setOauthTokenSecret( arg0.getOauthTokenSecret() );
        sysSocialBo.setOpenId( arg0.getOpenId() );
        sysSocialBo.setRefreshToken( arg0.getRefreshToken() );
        sysSocialBo.setScope( arg0.getScope() );
        sysSocialBo.setSource( arg0.getSource() );
        sysSocialBo.setTokenType( arg0.getTokenType() );
        sysSocialBo.setUnionId( arg0.getUnionId() );
        sysSocialBo.setUserId( arg0.getUserId() );
        sysSocialBo.setUserName( arg0.getUserName() );

        return sysSocialBo;
    }

    @Override
    public SysSocialBo convert(RemoteSocialBo arg0, SysSocialBo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setAccessCode( arg0.getAccessCode() );
        arg1.setAccessToken( arg0.getAccessToken() );
        arg1.setAuthId( arg0.getAuthId() );
        arg1.setAvatar( arg0.getAvatar() );
        arg1.setCode( arg0.getCode() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setExpireIn( arg0.getExpireIn() );
        arg1.setId( arg0.getId() );
        arg1.setIdToken( arg0.getIdToken() );
        arg1.setMacAlgorithm( arg0.getMacAlgorithm() );
        arg1.setMacKey( arg0.getMacKey() );
        arg1.setNickName( arg0.getNickName() );
        arg1.setOauthToken( arg0.getOauthToken() );
        arg1.setOauthTokenSecret( arg0.getOauthTokenSecret() );
        arg1.setOpenId( arg0.getOpenId() );
        arg1.setRefreshToken( arg0.getRefreshToken() );
        arg1.setScope( arg0.getScope() );
        arg1.setSource( arg0.getSource() );
        arg1.setTokenType( arg0.getTokenType() );
        arg1.setUnionId( arg0.getUnionId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setUserName( arg0.getUserName() );

        return arg1;
    }
}

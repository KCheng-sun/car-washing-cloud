package org.dromara.system.domain.convert;

import javax.annotation.processing.Generated;
import org.dromara.system.api.domain.vo.RemoteSocialVo;
import org.dromara.system.domain.vo.SysSocialVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysSocialVoConvertImpl implements SysSocialVoConvert {

    @Override
    public RemoteSocialVo convert(SysSocialVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RemoteSocialVo remoteSocialVo = new RemoteSocialVo();

        remoteSocialVo.setAccessCode( arg0.getAccessCode() );
        remoteSocialVo.setAccessToken( arg0.getAccessToken() );
        remoteSocialVo.setAuthId( arg0.getAuthId() );
        remoteSocialVo.setAvatar( arg0.getAvatar() );
        remoteSocialVo.setCode( arg0.getCode() );
        remoteSocialVo.setEmail( arg0.getEmail() );
        remoteSocialVo.setExpireIn( arg0.getExpireIn() );
        remoteSocialVo.setId( arg0.getId() );
        remoteSocialVo.setIdToken( arg0.getIdToken() );
        remoteSocialVo.setMacAlgorithm( arg0.getMacAlgorithm() );
        remoteSocialVo.setMacKey( arg0.getMacKey() );
        remoteSocialVo.setNickName( arg0.getNickName() );
        remoteSocialVo.setOauthToken( arg0.getOauthToken() );
        remoteSocialVo.setOauthTokenSecret( arg0.getOauthTokenSecret() );
        remoteSocialVo.setOpenId( arg0.getOpenId() );
        remoteSocialVo.setRefreshToken( arg0.getRefreshToken() );
        remoteSocialVo.setScope( arg0.getScope() );
        remoteSocialVo.setSource( arg0.getSource() );
        remoteSocialVo.setTenantId( arg0.getTenantId() );
        remoteSocialVo.setTokenType( arg0.getTokenType() );
        remoteSocialVo.setUnionId( arg0.getUnionId() );
        remoteSocialVo.setUserId( arg0.getUserId() );
        remoteSocialVo.setUserName( arg0.getUserName() );

        return remoteSocialVo;
    }

    @Override
    public RemoteSocialVo convert(SysSocialVo arg0, RemoteSocialVo arg1) {
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
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setTokenType( arg0.getTokenType() );
        arg1.setUnionId( arg0.getUnionId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setUserName( arg0.getUserName() );

        return arg1;
    }
}

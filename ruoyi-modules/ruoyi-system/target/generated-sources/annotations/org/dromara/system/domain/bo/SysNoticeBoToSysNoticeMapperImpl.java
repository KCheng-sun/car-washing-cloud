package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysNotice;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysNoticeBoToSysNoticeMapperImpl implements SysNoticeBoToSysNoticeMapper {

    @Override
    public SysNotice convert(SysNoticeBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysNotice sysNotice = new SysNotice();

        sysNotice.setCreateBy( arg0.getCreateBy() );
        sysNotice.setCreateDept( arg0.getCreateDept() );
        sysNotice.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysNotice.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysNotice.setSearchValue( arg0.getSearchValue() );
        sysNotice.setUpdateBy( arg0.getUpdateBy() );
        sysNotice.setUpdateTime( arg0.getUpdateTime() );
        sysNotice.setNoticeContent( arg0.getNoticeContent() );
        sysNotice.setNoticeId( arg0.getNoticeId() );
        sysNotice.setNoticeTitle( arg0.getNoticeTitle() );
        sysNotice.setNoticeType( arg0.getNoticeType() );
        sysNotice.setRemark( arg0.getRemark() );
        sysNotice.setStatus( arg0.getStatus() );

        return sysNotice;
    }

    @Override
    public SysNotice convert(SysNoticeBo source, SysNotice target) {
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
        target.setNoticeContent( source.getNoticeContent() );
        target.setNoticeId( source.getNoticeId() );
        target.setNoticeTitle( source.getNoticeTitle() );
        target.setNoticeType( source.getNoticeType() );
        target.setRemark( source.getRemark() );
        target.setStatus( source.getStatus() );

        return target;
    }
}

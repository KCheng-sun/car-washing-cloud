package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysDictTypeVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysDictTypeToSysDictTypeVoMapperImpl implements SysDictTypeToSysDictTypeVoMapper {

    @Override
    public SysDictTypeVo convert(SysDictType arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictTypeVo sysDictTypeVo = new SysDictTypeVo();

        sysDictTypeVo.setCreateTime( arg0.getCreateTime() );
        sysDictTypeVo.setDictId( arg0.getDictId() );
        sysDictTypeVo.setDictName( arg0.getDictName() );
        sysDictTypeVo.setDictType( arg0.getDictType() );
        sysDictTypeVo.setRemark( arg0.getRemark() );

        return sysDictTypeVo;
    }

    @Override
    public SysDictTypeVo convert(SysDictType source, SysDictTypeVo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setDictId( source.getDictId() );
        target.setDictName( source.getDictName() );
        target.setDictType( source.getDictType() );
        target.setRemark( source.getRemark() );

        return target;
    }
}

package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysDictDataVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysDictDataToSysDictDataVoMapperImpl implements SysDictDataToSysDictDataVoMapper {

    @Override
    public SysDictDataVo convert(SysDictData arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictDataVo sysDictDataVo = new SysDictDataVo();

        sysDictDataVo.setCreateTime( arg0.getCreateTime() );
        sysDictDataVo.setCssClass( arg0.getCssClass() );
        sysDictDataVo.setDictCode( arg0.getDictCode() );
        sysDictDataVo.setDictLabel( arg0.getDictLabel() );
        sysDictDataVo.setDictSort( arg0.getDictSort() );
        sysDictDataVo.setDictType( arg0.getDictType() );
        sysDictDataVo.setDictValue( arg0.getDictValue() );
        sysDictDataVo.setIsDefault( arg0.getIsDefault() );
        sysDictDataVo.setListClass( arg0.getListClass() );
        sysDictDataVo.setRemark( arg0.getRemark() );

        return sysDictDataVo;
    }

    @Override
    public SysDictDataVo convert(SysDictData source, SysDictDataVo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setCssClass( source.getCssClass() );
        target.setDictCode( source.getDictCode() );
        target.setDictLabel( source.getDictLabel() );
        target.setDictSort( source.getDictSort() );
        target.setDictType( source.getDictType() );
        target.setDictValue( source.getDictValue() );
        target.setIsDefault( source.getIsDefault() );
        target.setListClass( source.getListClass() );
        target.setRemark( source.getRemark() );

        return target;
    }
}

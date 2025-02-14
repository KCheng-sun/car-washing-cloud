package io.github.linpeilie;

import org.dromara.demo.domain.TestDemoToTestDemoVoMapper;
import org.dromara.demo.domain.TestTreeToTestTreeVoMapper;
import org.dromara.demo.domain.bo.TestDemoBoToTestDemoMapper;
import org.dromara.demo.domain.bo.TestTreeBoToTestTreeMapper;
import org.dromara.demo.domain.vo.TestDemoVoToTestDemoMapper;
import org.dromara.demo.domain.vo.TestTreeVoToTestTreeMapper;
import org.mapstruct.Builder;
import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
    componentModel = "spring",
    uses = {ConvertMapperAdapter.class, TestDemoBoToTestDemoMapper.class, TestDemoToTestDemoVoMapper.class, TestTreeVoToTestTreeMapper.class, TestTreeBoToTestTreeMapper.class, TestTreeToTestTreeVoMapper.class, TestDemoVoToTestDemoMapper.class},
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL,
    builder = @Builder(buildMethod = "build", disableBuilder = true)
)
public interface AutoMapperConfig {
}

package libdirector.dto.mapper;

import javax.annotation.processing.Generated;
import libdirector.domain.Category;
import libdirector.domain.dto.CategoryDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-16T03:59:39+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category CategoryDTOToCategory(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryDTO.getId() );
        category.setName( categoryDTO.getName() );
        category.setBuiltIn( categoryDTO.getBuiltIn() );
        category.setSequence( categoryDTO.getSequence() );

        return category;
    }
}

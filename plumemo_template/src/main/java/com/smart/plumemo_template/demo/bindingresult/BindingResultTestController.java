package com.smart.plumemo_template.demo.bindingresult;

import com.smart.plumemo_template.common.base.domain.Result;
import com.smart.plumemo_template.common.validator.group.Insert;
import com.smart.plumemo_template.plumemo.category.domain.vo.TagsVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/tags/test")
public class BindingResultTestController {

    @PostMapping("/tags/v1/add")
    public Result saveTags(@Validated({Insert.class}) @RequestBody TagsVO tagsVO, BindingResult result) {
        // ThrowableUtils.checkParamArgument(result);

        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            fieldErrors.forEach(fieldError -> {
                //日志打印不符合校验的字段名和错误提示
                log.error("error field is : {} ,message is : {}", fieldError.getField(), fieldError.getDefaultMessage());
            });
            for (int i = 0; i < fieldErrors.size(); i++) {
                //控制台打印不符合校验的字段名和错误提示
                System.out.println("error field is :" + fieldErrors.get(i).getField() + ",message is :" + fieldErrors.get(i).getDefaultMessage());
            }
            // pesponsibles.setError_msg(fieldErrors);
            return Result.createWithErrorMessage(fieldErrors.get(0).getDefaultMessage(), String.valueOf(400));

        }
        return Result.createWithSuccessMessage();

    }
}

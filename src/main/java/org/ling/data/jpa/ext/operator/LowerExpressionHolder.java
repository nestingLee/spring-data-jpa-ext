package org.ling.data.jpa.ext.operator;

import org.ling.data.jpa.ext.ExpressionHolder;
import lombok.RequiredArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

@RequiredArgsConstructor
public class LowerExpressionHolder implements ExpressionHolder<String> {

    private final ExpressionHolder<String> prev;

    @Override
    public Expression<String> getExpression(Root<?> root,
                                             CriteriaQuery<?> criteriaQuery,
                                             CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.lower(prev.getExpression(root, criteriaQuery, criteriaBuilder));
    }
}

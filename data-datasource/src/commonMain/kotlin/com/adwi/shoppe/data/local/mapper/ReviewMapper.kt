package com.adwi.shoppe.data.local.mapper

import com.adwi.kotlin.data.local.Review
import com.adwi.shoppe.data.remote.CreateReviewMutation
import com.adwi.shoppe.data.remote.GetReviewQuery
import com.adwi.shoppe.data.remote.ReviewsPagedByShopIdQuery
import com.adwi.shoppe.data.remote.UpdateReviewMutation

data class Reviews(
    val results: List<Review>,
    val info: ReviewsPagedByShopIdQuery.Info?,
)

fun ReviewsPagedByShopIdQuery.Result.toReview() = Review(
    id = id,
    userId = userId,
    shopId = shopId,
    text = text,
    rating = rating.toLong()
)

fun ReviewsPagedByShopIdQuery.ReviewsPagedByShopId.toReviews() = Reviews(
    results = this.results.map { it.toReview() },
    info = this.info
)

fun GetReviewQuery.GetReview.toReview() = Review(
    id = id,
    userId = userId,
    shopId = shopId,
    text = text,
    rating = rating.toLong()
)

fun CreateReviewMutation.CreateReview.toReview() = Review(
    id = id,
    userId = userId,
    shopId = shopId,
    text = text,
    rating = rating.toLong()
)

fun UpdateReviewMutation.UpdateReview.toReview() = Review(
    id = id,
    userId = userId,
    shopId = shopId,
    text = text,
    rating = rating.toLong()
)
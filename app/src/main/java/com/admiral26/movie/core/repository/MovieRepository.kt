package com.admiral26.movie.core.repository

import com.admiral26.movie.core.model.footerRes.FooterRespons
import com.admiral26.movie.core.model.headerRes.HeaderRespons
import com.admiral26.movie.core.network.service.MovieService
import com.admiral26.movie.core.util.ResultWrapper
import com.admiral26.movie.core.util.parseResponse
import kotlinx.coroutines.Dispatchers

class MovieRepository(val service: MovieService) {


    suspend fun getMoviesHed(): ResultWrapper<HeaderRespons?, Any> {
        return parseResponse(Dispatchers.IO) {
            service.getHeader("10137bab07a7a987b23a902a78d6986c")
        }
    }

    suspend fun getMoviesFoot(): ResultWrapper<FooterRespons?, Any> {
        return parseResponse(Dispatchers.IO) {
            service.getFooter("10137bab07a7a987b23a902a78d6986c")
        }
    }
}
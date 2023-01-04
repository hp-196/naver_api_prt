package naver.restaurant;

import lombok.RequiredArgsConstructor;
import naver.naver.NaverClient;
import naver.naver.dto.SearchLocalReq;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListService {

    private final NaverClient naverClient;

    public void search(String query) {

        var searchLocalReq = new SearchLocalReq();
        searchLocalReq.setQuery(query);

        var searchLocalRes = naverClient.localSearch(searchLocalReq);

        if (searchLocalRes.getTotal() > 0) {
            var item = searchLocalRes.getItems().stream().findFirst().get();

        }
    }
}

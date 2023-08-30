import java.util.List;

@Controller
public class AdsController {

    private final ListAdsDao listAdsDao;

    public AdsController(ListAdsDao listAdsDao) {
        this.listAdsDao = listAdsDao;
    }

    @RequestMapping(path = "/ads", method = RequestMethod.GET)
    public String showAds(ModelMap model) {
        List<Ad> ads = listAdsDao.all();
        model.addAttribute("ads", ads);
        return "ads/index";
    }
}

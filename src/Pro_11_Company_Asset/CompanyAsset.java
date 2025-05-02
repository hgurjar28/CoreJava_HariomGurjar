package Pro_11_Company_Asset;
import java.util.*;

public class CompanyAsset {
    private Map<String, Set<Asset>> departmentAssets = new HashMap<>();
    private Set<String> usedAssetIds = new HashSet<>();

    public void addAsset(String department, Asset asset) {
        if (usedAssetIds.contains(asset.getId())) {
            System.out.println("Duplicate Asset ID: " + asset.getId() + " not added.");
            return;
        }

        if (!departmentAssets.containsKey(department)) {
            Set<Asset> assets = new HashSet<>();
            assets.add(asset);
            departmentAssets.put(department, assets);
        } else {
            Set<Asset> assets = departmentAssets.get(department);
            assets.add(asset);
        }
        usedAssetIds.add(asset.getId());
        System.out.println("Asset added successfully.");
    }
    public void printAssets() {
        System.out.println("\nAssets by Department:");
        for (String dept : departmentAssets.keySet()) {
            System.out.println(dept + ": " + departmentAssets.get(dept));
        }
    }
}

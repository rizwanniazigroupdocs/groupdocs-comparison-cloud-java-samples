package examples.Working_With_Storage;

import com.groupdocs.cloud.comparison.api.*;
import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.model.*;
import com.groupdocs.cloud.comparison.model.requests.*;
import examples.Utils;

public class Comparison_Java_Object_Exists {

	public static void main(String[] args) {

		StorageApi apiInstance = new StorageApi(Utils.AppSID, Utils.AppKey);
		try {
			ObjectExistsRequest request = new ObjectExistsRequest("Comparisondocs\\one-page.docx", Utils.MYStorage, null);
			ObjectExist response = apiInstance.objectExists(request);
			System.out.println("Expected response type is ObjectExist: " + response.getExists());
		} catch (ApiException e) {
			System.err.println("Exception while calling StorageApi:");
			e.printStackTrace();
		}
	}
}
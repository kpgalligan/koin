package org.koin.test

import org.koin.core.qualifier.Qualifier
import kotlin.random.Random

@Suppress("unused")
class Simple {
    class ComponentA
    class ComponentB(val a: ComponentA)
    class MyString(val s: String)

    class UUIDComponent {
        fun getUUID() = uuids[Random.nextInt(uuids.size)]
    }
}

object UpperCase : Qualifier {
    override val value: String = "UpperCase"

}

internal val uuids = arrayOf(
"3c3baf7c-3685-42a5-84ff-13c4125c7713",
"77428d09-6b72-484f-a71b-6ef7f5308276",
"99f11a42-0bae-4dbf-922f-72aad2878cce",
"efdc2a2c-98f7-4a48-8e9c-92c51f4f0d63",
"996ec549-8559-46ad-b6c8-45a67f07151a",
"8fdd4aff-f3ff-4988-975a-3b66ab1ee4db",
"689fbff8-e4cc-4f72-82d8-050ad3f1e662",
"7b7de27f-f24b-4fe1-8b8b-796a8c1379ae",
"88f5df38-df4a-49a5-b26d-6601ee5461f9",
"edcd573c-4415-40b6-860f-dc10a00d9273",
"c8bc12a1-dca6-46a3-b092-4948704b3d8c",
"a7b6bba0-9f82-4282-b918-c97d96f469a7",
"e5dfd169-0659-478e-a9ae-e33d1d9e9723",
"09bb531b-ab15-4a34-a678-0614851cf201",
"1ea8b78b-233b-4330-af23-28b0ba1f1f82",
"72b51ae9-8cb1-437f-8c72-e6647031a75f",
"539ff9c8-3c5f-4b1f-9c2b-58a96f9f53ad",
"ff2a2eb8-aea2-4d84-94ab-29f8ebf0f39b",
"a2bb5f57-3796-457e-ace0-e4fd915916d2",
"4dc22818-83c9-46c6-8966-51900366f43a",
"2a7fb9cd-fc67-4733-9d57-c54557751861",
"ba13296a-9c53-4f87-a90e-d579f85027df",
"dca0959e-ee8d-4468-9806-256860541898",
"553538ac-660d-4da0-8380-6068b03529a9",
"2b1771e0-4227-4422-b60d-62362767bbea",
"b1603c27-8ca4-49bb-96cf-5196bc9f7dfe",
"9d4d9a5b-d6ff-4695-a83e-bb279436ff36",
"976e13ab-9403-4a32-931b-cbf81ce99c6f",
"a6ebf222-3d33-48c6-8052-38ef1d4d03eb",
"78f6162d-56a9-4940-a9aa-ee94e0321a96",
"d1d54cbc-3c44-4159-a057-22e6cdf2bd57",
"498de1a2-34d9-44d2-a499-07b714adf2e6",
"7901f380-ac3c-4692-8342-83314db0dbc9",
"426e8c1c-0754-4a41-9da3-b9bddd30c646",
"8a5830f2-5726-4083-be14-706b63f021ff",
"3a679189-6412-4f70-8be2-86fefadad9cc",
"7b4d0510-c339-4160-b405-b8c2b945e9d0",
"3fa87eb2-557e-40c4-9700-1da630d670b3",
"32fadf16-933c-408c-ab99-7dffb9972b22",
"fe380b80-89a1-4966-9485-eff045a1e400",
"8277d613-303c-43ae-9721-bbe8905d15b7",
"8efb3d79-e333-4351-8d90-2907c51689bb",
"08fb1e52-b28f-4eb8-8c15-6af3509a8283",
"c2ddc159-d87d-437c-991a-24a494e46520",
"37713774-f319-46ee-8b2d-e4e58ef86d82",
"b5a8dc22-e026-454f-b519-77f0ab51a282",
"df5d7bc3-0b78-4c67-a650-fa5d5139e86c",
"84a2661d-d356-4d2b-a324-dcefbd3d83b3",
"7733fd13-5b24-40a4-b4c5-3e1af8f45044",
"4ef00d5f-04fa-4382-b9e9-29e97cc367da",
"653ace24-ce5c-46b9-b879-9650940c395c",
"ccdf4fb7-b28f-4e94-9300-af14a32c98fb",
"db09d191-f273-4597-9040-1aeba52bc33f",
"c0fbda09-4a5c-4cef-afa7-dc66a565e987",
"597a7638-afab-4f05-a3aa-f9b78f911b76",
"af752b80-cf76-44d1-860a-bdd42d9c6308",
"ce0bee02-da79-497e-8a7b-4631916ab549",
"8b43ac5c-9707-4130-a787-3178dbce778d",
"ec898e6d-c39b-44db-812d-2009cc850089",
"850d5805-3209-458b-a1f9-7e7c4f47bfc6",
"99a586df-bd53-4057-94ff-014c9b0bc22f",
"3b0fad31-790a-4fae-97a0-aa01c38c495c",
"29e54bd3-5032-4c79-a42c-a001912e6beb",
"2c9563bf-8b1d-4bbf-a3f8-986d80362773",
"16c89b99-7a97-458e-a3df-e17784416387",
"c2c90c86-4dff-4bed-9497-ddfe7a954d91",
"db9ddc59-b9da-454f-91b8-136c5b28fe03",
"1fafb87f-8999-466e-b9d7-b67ad9b67b7a",
"93dff2e1-deab-44f4-87c8-ede0c0888b18",
"be38e074-54b6-4fde-bd6c-3b72f06a6901",
"d8714a00-490d-4e82-b11f-0a76f39c986a",
"43db454f-7061-4514-83a6-45e8a5eeea36",
"b8fdbf84-b503-4a54-bfde-abf8175382c0",
"d3548edf-93f0-44bb-b455-7224ba8b9668",
"bceb8336-7a88-4874-bb94-ae3f477dc882",
"1f9da527-bd56-4a71-8702-6a00859b7cec",
"876a802f-396a-4ce2-b755-ce34c9a57c4d",
"4a7a83b6-e293-4fb1-acb6-fecbbf7692f8",
"58e82507-bf3d-4a8c-843b-d4edc35a855d",
"3848a5a0-7f52-4bcc-a37a-628aa3fc77ac",
"4f45581e-17d4-4822-a493-a5e5ac220f9f",
"6d480933-c5b9-46c7-8ade-b2af6c415657",
"7dc791ac-c992-472b-b27c-5daed26987cd",
"c89c39fd-1afb-4b5e-855c-4785826a9499",
"dab24135-83e8-4f41-8bb9-61c8e5f9697a",
"c306f9bf-988c-436d-b29b-459c22dd536a",
"42f09729-a7ed-4f4e-b0aa-be4a688b68b1",
"004cb9f0-ed81-43a7-90c6-ee7be3686368",
"d3a5f594-3382-4a04-be73-1b6dbba6ee7f",
"c2016102-7a18-4700-b984-146c04d66f4c",
"edd70c91-ccb1-42d8-9214-6d27fdd6fb50",
"86e5f266-e3f0-457d-b764-ceea7163ae30",
"c7713d6d-baa9-4e27-80bd-402efa7b8c0c",
"692435a2-b9f4-49b6-bb61-48806a2390fe",
"b9498a23-dd73-41c2-8246-ff1f84e2f017",
"ca2c566e-88cd-4f08-aeaa-098e22eb91d9",
"95ef45c4-6388-4994-b600-36d94e7c93f5",
"568e7659-c88f-4467-9d5b-b81dc004ffdd",
"c32648bb-2397-4cab-bdda-3c02e717821f",
"90517adc-ca89-41a8-a621-71648b771f99"
)

package ru.mireastick.stickcoin.model.json.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.mireastick.stickcoin.model.blockchain.Blockchain;
import ru.mireastick.stickcoin.utils.BlockChainUtil;

public class Basic
{
	public static void main(String[] args)
	{
		Blockchain blockchain = BlockChainUtil.createBlockChain();


		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.create();
		String json = gson.toJson(blockchain);

		System.out.println(json);




	}
}

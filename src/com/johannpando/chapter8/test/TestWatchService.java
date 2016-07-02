package com.johannpando.chapter8.test;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestWatchService {

	public static void main(String[] args) {
		Path dir = Paths.get("I:\\whizlabs");
		try {
			WatchService watch = dir.getFileSystem().newWatchService();
			dir.register(watch, ENTRY_MODIFY, ENTRY_CREATE);

			WatchKey key = watch.poll(10000, TimeUnit.MILLISECONDS);
			List<WatchEvent<?>> events = key.pollEvents();
			for (WatchEvent<?> event : events) {
				if (event.kind() == ENTRY_CREATE) {
					System.out.println("A file created");
				}
				if (event.kind() == ENTRY_MODIFY) {
					System.out.println("A file modified");
				}
			}

		} catch (ClosedWatchServiceException e) {
			System.out.println("Error");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecsdemo.transform.v20190620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsdemo.model.v20190620.GetNameResponse;
import com.aliyuncs.ecsdemo.model.v20190620.GetNameResponse.Question;
import com.aliyuncs.ecsdemo.model.v20190620.GetNameResponse.Question.Answers;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNameResponseUnmarshaller {

	public static GetNameResponse unmarshall(GetNameResponse getNameResponse, UnmarshallerContext _ctx) {
		
		getNameResponse.setRequestId(_ctx.stringValue("GetNameResponse.RequestId"));

		Question question = new Question();
		question.setTitle(_ctx.stringValue("GetNameResponse.Question.Title"));
		question.setContent(_ctx.stringValue("GetNameResponse.Question.Content"));

		List<Answers> answerList = new ArrayList<Answers>();
		for (int i = 0; i < _ctx.lengthValue("GetNameResponse.Question.AnswerList.Length"); i++) {
			Answers answers = new Answers();
			answers.setTitle(_ctx.stringValue("GetNameResponse.Question.AnswerList["+ i +"].Title"));
			answers.setContent(_ctx.stringValue("GetNameResponse.Question.AnswerList["+ i +"].Content"));

			answerList.add(answers);
		}
		question.setAnswerList(answerList);
		getNameResponse.setQuestion(question);
	 
	 	return getNameResponse;
	}
}